package com.shinemo.mpush.core.message;

import com.shinemo.mpush.api.Connection;
import com.shinemo.mpush.api.protocol.Packet;
import io.netty.buffer.ByteBuf;

/**
 * Created by ohun on 2015/12/25.
 */
public class FastConnectMessage extends BaseBufferBodyMessage {
    public String tokenId;
    public String deviceId;

    public FastConnectMessage(Packet message, Connection connection) {
        super(message, connection);
    }

    @Override
    public void decode(ByteBuf body) {

    }

    @Override
    public void encode(ByteBuf body) {

    }
}
