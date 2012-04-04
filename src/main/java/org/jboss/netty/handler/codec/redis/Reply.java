/*
 * Copyright 2011 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jboss.netty.handler.codec.redis;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.util.CharsetUtil;

/**
 * {@link Reply} which was sent as a Response to the written {@link Command}
 *  *
 */
public abstract class Reply {

    /**
     * Write the content of the {@link Reply} to the given {@link ChannelBuffer}
     */
    abstract void write(ChannelBuffer out);

    @Override
    public String toString() {
        ChannelBuffer channelBuffer = ChannelBuffers.dynamicBuffer();
        write(channelBuffer);
        return channelBuffer.toString(CharsetUtil.UTF_8);
    }
}