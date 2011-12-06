/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.begla.blockmania.gui.components;

import com.github.begla.blockmania.gui.framework.UIDisplayElement;

import static org.lwjgl.opengl.GL11.*;

/**
 * A crosshair.
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class UICrosshair extends UIDisplayElement {

    public void render() {
        glColor4f(1f, 1f, 1f, 1f);
        glLineWidth(2f);

        glBegin(GL_LINES);
        glVertex2f(-8f, 0f);
        glVertex2f(8f, 0f);
        glVertex2f(0f, -8f);
        glVertex2f(0f, 8f);
        glEnd();
    }

    @Override
    public void update() {
    }
}
