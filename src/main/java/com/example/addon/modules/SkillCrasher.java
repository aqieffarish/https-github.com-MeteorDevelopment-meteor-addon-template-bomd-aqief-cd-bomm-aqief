for (int c = 0; c < packets; c++) {
	switch (mode){
		case "SKILLPLUGIN":
			mc.getNetHandler().getNetworkManager().sendPacket(new C01PacketChatMessage("/skills"));
			break;
		case "SKILLSPIGOT":
			//IT GENERATING RANDOM CHARACTERS BUT IDC TO DO THAT UwU
			mc.getNetHandler().getNetworkManager().sendPacket(new C01PacketChatMessage("/skillč˝Ąă•ˇŕą‘â’Şç–µâ\u0090žňŽ‘©ŕ¤żć\u0090Ť â©ˇě‰Śá‹·ć¸źńĽ±Ťĺ ŻăŠ„ç«ąâš‚"));
			break;
	}
}