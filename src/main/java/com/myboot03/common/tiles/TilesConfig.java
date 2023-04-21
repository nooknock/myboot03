package com.myboot03.common.tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration //클래스에 지정함, 스프링 설정 클래스로 지정 //틀이 클래스고 타입이 틀이다 틀로 찍어낸게 객체다
public class TilesConfig{
	
	@Bean //자바 클래스의 메서드에 적용해 Bean을 반환하도록 지정
	public TilesConfigurer tilesConfigurer() {
		
		final TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles_member.xml"});
//		configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles_member.xml","WEB-INF/tiles/tiles_board.xml"});
		configurer.setCheckRefresh(true);
		return configurer;
	}
	@Bean
	public TilesViewResolver tilesViewResolver() {
		final TilesViewResolver resolver = new TilesViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}
}
