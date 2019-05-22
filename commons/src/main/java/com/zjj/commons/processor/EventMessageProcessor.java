package com.zjj.commons.processor;

import com.zjj.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	void onMessage(EventInMessage event);

}
