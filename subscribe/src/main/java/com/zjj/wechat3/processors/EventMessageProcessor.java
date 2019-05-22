package com.zjj.wechat3.processors;

import com.zjj.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}
