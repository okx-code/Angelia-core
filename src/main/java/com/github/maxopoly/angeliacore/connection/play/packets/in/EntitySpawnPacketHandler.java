package com.github.maxopoly.angeliacore.connection.play.packets.in;

import com.github.maxopoly.angeliacore.connection.ServerConnection;
import com.github.maxopoly.angeliacore.packet.ReadOnlyPacket;

public class EntitySpawnPacketHandler extends AbstractIncomingPacketHandler {

	public EntitySpawnPacketHandler(ServerConnection connection) {
		super(connection, 0x00);
	}

	@Override
	public void handlePacket(ReadOnlyPacket packet) {

	}

}