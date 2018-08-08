package com.yanghua.gongxiang.services;

import com.yanghua.gongxiang.bean.ContentType;
import com.yanghua.gongxiang.dao.ContentTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.*;




public class MyInvocationSecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private ContentTypeMapper contentTypeMapper;
    private HashMap<String, Collection<ConfigAttribute>> map =null;
    /**
     * 加载权限表中所有权限
     */
    public void loadResourceDefine(){
        map = new HashMap<String ,Collection<ConfigAttribute>>();
        Collection<ConfigAttribute> array;
        ConfigAttribute cfg;

        List<ContentType> contentTypes=contentTypeMapper.findall();
        for(ContentType contentType : contentTypes){
            array = new ArrayList<ConfigAttribute>();


            cfg = new SecurityConfig(String.valueOf(contentType.getId()));

            array.add(cfg);

            map.put(contentType.getTpPath(),array);

        }

    }


    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        if(map ==null) loadResourceDefine();

        HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();

        AntPathRequestMatcher matcher;
        String resUrl;
        for(Iterator<String> iter = map.keySet().iterator(); iter.hasNext(); ) {
            resUrl = iter.next();

            matcher = new AntPathRequestMatcher(resUrl);
            if(matcher.matches(request)) {


                return map.get(resUrl);
            }
        }
        return null;
    }
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}

