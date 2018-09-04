package com.matas.digester.rule;

import org.apache.tomcat.util.IntrospectionUtils;
import org.apache.tomcat.util.digester.Rule;
import org.xml.sax.Attributes;

/**
 * @author matas
 * @date 2018/9/4 17:12
 * @email mataszhang@163.com
 */
public class EnCodeRule extends Rule {

    private String pname;

    public EnCodeRule(String pname) {
        this.pname = pname;
    }

    @Override
    public void begin(String namespace, String name, Attributes attributes) throws Exception {
        Object top = this.digester.peek();
        Object property = IntrospectionUtils.getProperty(top, pname);
        IntrospectionUtils.setProperty(top, pname, "编码" + property);
    }
}
