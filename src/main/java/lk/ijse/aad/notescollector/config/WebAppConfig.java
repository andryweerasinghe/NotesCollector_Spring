/*
 * Author  : Mr.electrix
 * Project : NotesCollector
 * Date    : 9/7/24

 */

package lk.ijse.aad.notescollector.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.notescollector")
@EnableWebMvc
public class WebAppConfig {
}
