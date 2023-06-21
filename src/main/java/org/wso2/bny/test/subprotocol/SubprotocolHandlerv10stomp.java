package org.wso2.bny.test.subprotocol;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.wso2.carbon.inbound.endpoint.protocol.websocket.AbstractSubprotocolHandler;

public class SubprotocolHandlerv10stomp extends AbstractSubprotocolHandler {

    public SubprotocolHandlerv10stomp() {
        super.setSubprotocolIdentifier("v10.stomp");
    }

    @Override
    public boolean handle(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, String s) {
        return true;
    }
}
