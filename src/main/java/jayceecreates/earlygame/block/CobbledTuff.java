package jayceecreates.earlygame.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class CobbledTuff extends Block {

    public CobbledTuff() {
        super(FabricBlockSettings.copy(Blocks.TUFF).strength(2.0F, 6.0F));
    }
    
}