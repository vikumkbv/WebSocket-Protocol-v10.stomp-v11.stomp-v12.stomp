package org.wso2.bny.test.subprotocol;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.wso2.carbon.inbound.endpoint.protocol.websocket.AbstractSubprotocolHandler;

public class SubprotocolHandlerv12stomp extends AbstractSubprotocolHandler {

    public SubprotocolHandlerv12stomp() {
        super.setSubprotocolIdentifier("v12.stomp");
    }

    @Override
    public boolean handle(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, String s) {
        return true;
    }
}
