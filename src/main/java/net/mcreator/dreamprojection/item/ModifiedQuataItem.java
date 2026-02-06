package net.mcreator.dreamprojection.item;

public class ModifiedQuataItem extends Item {
	public ModifiedQuataItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}
}