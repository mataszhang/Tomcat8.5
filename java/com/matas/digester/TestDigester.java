package com.matas.digester;

import com.matas.digester.domain.Department;
import com.matas.digester.domain.User;
import org.apache.tomcat.util.digester.Digester;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author matas
 * @date 2018/9/3 17:53
 * @email mataszhang@163.com
 */
public class TestDigester {
    public static void main(String[] args) throws IOException, SAXException {
        Digester digester = new Digester();
        digester.setValidating(false);
        digester.setRulesValidation(true);

        digester.addObjectCreate("department", Department.class.getName());
        digester.addSetProperties("department");

        digester.addObjectCreate("department/user" , User.class.getName());
        digester.addSetProperties("department/user");
        digester.addSetNext("department/user","addUser", User.class.getName());

        digester.addCallMethod("department/extension","putProps" ,2);
        digester.addCallParam("department/extension/pname",0);
        digester.addCallParam("department/extension/pvalue",1);

        InputStream in = TestDigester.class.getResourceAsStream("test.xml");
        Object parse = digester.parse(in);
        System.out.println(parse);
    }
}
