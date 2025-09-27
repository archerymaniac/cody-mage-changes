package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class AAAACODYCUBE extends ExpansionSet {

    private static final AAAACODYCUBE instance = new AAAACODYCUBE();

    public static AAAACODYCUBE getInstance() {
        return instance;
    }

    private AAAACODYCUBE() {
        super("Aetherdrift", "DFT", ExpansionSet.buildDate(2025, 6, 5), SetType.EXPANSION);
        this.blockName = "Aetherdrift"; // for sorting in GUI

        this.enablePlayBooster(Integer.MAX_VALUE);

        cards.add(new SetCardInfo("Aatchik, Emerald Radian", 187, Rarity.RARE, mage.cards.a.AatchikEmeraldRadian.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Aatchik, Emerald Radian", 999, Rarity.RARE, mage.cards.a.AatchikEmeraldRadian.class, NON_FULL_USE_VARIOUS));
    }
}
