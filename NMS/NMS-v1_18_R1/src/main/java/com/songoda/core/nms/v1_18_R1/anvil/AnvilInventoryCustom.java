package com.songoda.core.nms.v1_18_R1.anvil;

import net.minecraft.world.IInventory;
import net.minecraft.world.inventory.ContainerAnvil;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_18_R1.inventory.CraftInventoryAnvil;
import org.bukkit.inventory.InventoryHolder;

public class AnvilInventoryCustom extends CraftInventoryAnvil {
    final InventoryHolder holder;

    public AnvilInventoryCustom(InventoryHolder holder, Location location, IInventory inventory, IInventory resultInventory, ContainerAnvil container) {
        super(location, inventory, resultInventory, container);

        this.holder = holder;
    }

    @Override
    public InventoryHolder getHolder() {
        return holder;
    }
}
