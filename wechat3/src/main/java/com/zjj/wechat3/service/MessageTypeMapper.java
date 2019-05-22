package com.zjj.wechat3.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.zjj.commons.domain.InMessage;
import com.zjj.commons.domain.event.EventInMessage;
import com.zjj.commons.domain.image.ImageInMessage;
import com.zjj.commons.domain.link.LinkInMessage;
import com.zjj.commons.domain.location.LocationInMessage;
import com.zjj.commons.domain.shortvideo.ShortVideoInMessage;
import com.zjj.commons.domain.text.TextInMessage;
import com.zjj.commons.domain.video.VideoInMessage;
import com.zjj.commons.domain.voice.VoiceInMessage;

public class MessageTypeMapper {

	private static Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();

	// 通过一个Map记录了消息类型和类的关系
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("voice", VoiceInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("shortvideo", ShortVideoInMessage.class);
		typeMap.put("link", LinkInMessage.class);
		typeMap.put("event", EventInMessage.class);
	}

	// 通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T> getClass(String type) {
		return (Class<T>) typeMap.get(type);
	}
}