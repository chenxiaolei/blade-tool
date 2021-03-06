/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.core.tool.config;


import org.springblade.core.tool.support.xss.XssProperties;
import org.springblade.core.tool.support.xss.XssUrlProperties;
import org.springblade.core.tool.utils.SpringUtil;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 工具配置类
 *
 * @author Chill
 */
@Configuration
@EnableConfigurationProperties({XssProperties.class, XssUrlProperties.class})
public class ToolConfiguration {

	/**
	 * Spring上下文缓存
	 */
	@Bean
	public SpringUtil springUtils() {
		return new SpringUtil();
	}

}
