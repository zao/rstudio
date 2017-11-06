/*
 * QWebChannel.js
 *
 * Copyright (C) 2009-17 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

new QWebChannel(qt.webChannelTransport, function(channel) {

   // export all channel objects to main window
   var objects = channel.objects;
   for (var key in objects) {
      if (objects.hasOwnProperty(key)) {
         window[key] = objects[key];
      }
   }
   
   // make channel generally accessible (for debugging)
   window.qt.channel = channel;
   
});