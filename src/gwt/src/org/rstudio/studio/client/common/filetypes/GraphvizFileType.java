/*
 * GraphViz.java
 *
 * Copyright (C) 2022 by Posit Software, PBC
 *
 * Unless you have received this program directly from Posit Software pursuant
 * to the terms of a commercial license agreement with Posit Software, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.common.filetypes;

import org.rstudio.core.client.resources.ImageResource2x;
import org.rstudio.studio.client.common.reditor.EditorLanguage;

public class GraphvizFileType extends PreviewableFromRFileType
{
   public GraphvizFileType()
   {
      super("graphviz", "GraphViz", EditorLanguage.LANG_GRAPHVIZ, ".gv",
            new ImageResource2x(FileIconResources.INSTANCE.iconGraphviz2x()), "DiagrammeR::grViz",
            false);
   }
}
