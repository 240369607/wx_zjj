package com.zjj.wechat3.service;

import com.zjj.commons.domain.InMessage;
import com.zjj.commons.domain.OUtMessage;

public interface MessageService {

	OUtMessage onMessage(InMessage msg);
}
