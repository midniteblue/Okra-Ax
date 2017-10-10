/*
 *     Copyright 2016-2026 TinyZ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ogcs.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

/**
 * Spring Application Context.
 *
 * @author TinyZ.
 * @since 1.0
 */
@Service("AppContext")
public final class AppContext implements ApplicationContextAware {

    private static final Logger LOG = LogManager.getLogger(AppContext.class);
    private static ApplicationContext context;

    private AppContext() {
        // no-op
    }

    public static <T> T getBean(Class<T> clz) {
        if (null == clz)
            return null;
        try {
            return context.getBean(clz);
        } catch (Exception e) {
            LOG.error(" Class : " + clz.toString(), e);
        }
        return null;
    }

    /**
     * Get bean
     *
     * @param beanName The bean name.
     * @param clz      The bean class.
     * @param <T>      The bean {@link Type}
     * @return Return the bean
     */
    public static <T> T getBean(String beanName, Class<T> clz) {
        if (null == beanName)
            return null;
        try {
            return context.getBean(beanName, clz);
        } catch (Exception e) {
            LOG.error("Unknown Bean Name : " + beanName + ", Class : " + clz.toString(), e);
        }
        return null;
    }

    /**
     * Get bean by bean name.
     *
     * @param beanName The bean name.
     * @return Return the bean
     */
    public static Object getBean(String beanName) {
        if (null == beanName) {
            return null;
        }
        Object bean = null;
        try {
            bean = context.getBean(beanName);
        } catch (Exception e) {
            LOG.info("Unknown Bean Name : " + beanName, e);
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
