/*
 * Author  : Mr.electrix
 * Project : NotesCollector
 * Date    : 9/7/24

 */

package lk.ijse.aad.notescollector;

import lk.ijse.aad.notescollector.config.WebAppConfig;
import lk.ijse.aad.notescollector.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
