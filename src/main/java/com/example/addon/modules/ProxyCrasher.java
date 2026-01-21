while (enabled) {
    switch (mode) {
        case "BUNGEE":
            mc.getNetHandler().getNetworkManager().sendPacket(new C01PacketChatMessage("/bungee"));
            break;
        case "VELOCITY":
            mc.getNetHandler().getNetworkManager().sendPacket(new C01PacketChatMessage("/velocity version"));
            break;
    }
}