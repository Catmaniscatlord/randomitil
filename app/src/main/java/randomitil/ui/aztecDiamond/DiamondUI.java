// Package Declaration
package randomitil.ui.aztecDiamond;

// Imports
import randomitil.animation.*;
import randomitil.ui.*;

// Class Declaration
public class DiamondUI extends TilingsUI {
    // Serialization
    private static final long serialVersionUID = 3327828037218852291L;
    
    /// Constructor ///
    public DiamondUI(DiamondDrawer drawer) {
        super(drawer);
    }

    /// Add Control Panels ///
    @Override
    public void addControlPanels() {
        // Add Control Panels
        this.add(new UIGenPanel((DiamondDrawer) drawer, this.uiBorder));
        this.add(new UIColorPanel(drawer, this.uiBorder));
        this.add(new UIColorChangePanel(drawer, this.uiBorder));
    }
}