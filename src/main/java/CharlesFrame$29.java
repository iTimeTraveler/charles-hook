package com.xk72.charles.gui;

import com.xk72.charles.gui.lib.CharlesShowDialogAction;
import com.xk72.charles.gui.settings.ACLSettingsPanel;
import com.xk72.charles.gui.settings.SettingsDialog;
import java.awt.Window;
import java.awt.event.ActionEvent;

public class CharlesFrame$29 extends CharlesShowDialogAction {
    final CharlesFrame chls_frame;

    public CharlesFrame$29(CharlesFrame charlesFrame, String str) {
        super(str);
        this.chls_frame = charlesFrame;
    }

    public Window createDialog(ActionEvent var1) {
        return new SettingsDialog(this.chls_frame, "Test Control Settings", new ACLSettingsPanel());
    }
}