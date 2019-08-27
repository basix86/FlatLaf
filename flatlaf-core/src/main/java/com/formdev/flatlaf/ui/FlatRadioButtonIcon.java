/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.ui;

import java.awt.Graphics2D;

/**
 * Icon for {@link javax.swing.JRadioButton}.
 *
 * @author Karl Tauber
 */
public class FlatRadioButtonIcon
	extends FlatCheckBoxIcon
{
	@Override
	protected void paintFocusBorder( Graphics2D g2 ) {
		g2.fillOval( 0, 0, iconSize, iconSize );
	}

	@Override
	protected void paintBorder( Graphics2D g2 ) {
		g2.fillOval( focusWidth, focusWidth, 15, 15 );
	}

	@Override
	protected void paintBackground( Graphics2D g2 ) {
		g2.fillOval( focusWidth + 1, focusWidth + 1, 13, 13 );
	}

	@Override
	protected void paintCheckmark( Graphics2D g2 ) {
		g2.fillOval( focusWidth + 5, focusWidth + 5, 5, 5 );
	}
}
