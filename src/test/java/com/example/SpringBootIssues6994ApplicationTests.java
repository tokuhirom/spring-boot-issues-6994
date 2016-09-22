package com.example;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.IOException;
import java.io.StringWriter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootIssues6994ApplicationTests.class)
@EnableAutoConfiguration
public class SpringBootIssues6994ApplicationTests {
    @Autowired
    FreeMarkerConfig freeMarkerConfig;

    @Test
    public void contextLoads() throws IOException, TemplateException {
        Template template = freeMarkerConfig.getConfiguration().getTemplate("index.ftl");
        StringWriter stringWriter = new StringWriter();
        template.process(null, stringWriter);
        System.out.println(stringWriter.toString());
    }
}
