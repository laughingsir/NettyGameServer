package com.wolf.shoot.udp.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.DatagramPacket;
import java.nio.ByteBuffer;

/**
 * Created by jwp on 2017/1/20.
 */
public class EchoServerHandler extends SimpleChannelInboundHandler<DatagramPacket> {
    public static final Logger utilLogger = LoggerFactory.getLogger("util");

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket datagramPacket) throws Exception {
        //读取数据
        ByteBuffer buf =  ByteBuffer.wrap(datagramPacket.getData());
        ByteBuffer readBuffer = buf.asReadOnlyBuffer();
        String body = new String(readBuffer.array(), CharsetUtil.UTF_8);

    }
}
