/*
 * Copyright (C) 2016 TestBird  - All Rights Reserved
 * You may use, distribute and modify this code under
 * the terms of the mit license.
 */
package com.testbird.artisan.TestBirdAgent.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenxuesong on 16/1/29.
 */
class ActivityTrack {

    String event;
    long time;

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("event", event);
        map.put("time", time);
        return map;
    }
}
