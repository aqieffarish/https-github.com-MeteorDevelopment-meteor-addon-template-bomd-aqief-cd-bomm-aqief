while(enabled) {
    switch (mode) {
        case "RANDOMPACKETA":
            //ClientUpdateSignPacket{position=Position{x=87, y=76, z=245}, lines=[{"text":"bella"}, {"text":"bella"}, {"text":"bella"}, {"text":"bella"}]}
            mc.getNetHandler().getNetworkManager().sendPacket(new C12PacketUpdateSign(mc.thePlayer.getPosition(), 
			new IChatComponent[]{
				new ChatComponentText("bella"),
				new ChatComponentText("bella"),
				new ChatComponentText("bella"),
				new ChatComponentText("bella")
			}));
            break;
        case "RANDOMPACKETB":
            //ClientKeepAlivePacket{id=0}
            mc.getNetHandler().getNetworkManager().sendPacket(new C00PacketKeepAlive(0));
            break;
    }
}