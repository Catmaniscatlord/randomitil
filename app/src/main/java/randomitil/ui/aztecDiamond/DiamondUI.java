// Package Declaration
package randomitil.ui.aztecDiamond;

// Imports
import randomitil.animation.aztecDiamond.*;
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
    protected void addControlPanels() {
        // Setup animator object
        DiamondAnimator animator = new DiamondAnimator((DiamondDrawer) drawer);
        
        // Add Control Panels
        this.add(new UIDiamondGenPanel((DiamondDrawer) drawer, animator, this.uiBorder));
        addBoxGap();

        this.add(new UIAnimPanel(drawer, animator, this.uiBorder));
        addBoxGap();

        this.add(new UIDiamondColorPanel(drawer, this.uiBorder));
        addBoxGap();

        this.add(new UIColorChangePanel(drawer, this.uiBorder));
    }
}