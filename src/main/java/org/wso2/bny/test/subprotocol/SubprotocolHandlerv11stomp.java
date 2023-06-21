package org.wso2.bny.test.subprotocol;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.wso2.carbon.inbound.endpoint.protocol.websocket.AbstractSubprotocolHandler;

public class SubprotocolHandlerv11stomp extends AbstractSubprotocolHandler {

    public SubprotocolHandlerv11stomp() {
        super.setSubprotocolIdentifier("v11.stomp");
    }

    @Override
    public boolean handle(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, String s) {
        return true;
    }
}
