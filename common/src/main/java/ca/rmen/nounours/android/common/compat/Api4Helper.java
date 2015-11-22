/*
 *   Copyright (c) 2009 - 2015 Carmen Alvarez
 *
 *   This file is part of Nounours for Android.
 *
 *   Nounours for Android is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Nounours for Android is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Nounours for Android.  If not, see <http://www.gnu.org/licenses/>.
 */

package ca.rmen.nounours.android.common.compat;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;

@TargetApi(4)
class Api4Helper {
    private Api4Helper() {
        // prevent instantiation
    }

    public static void setBitmapFactoryOptions(BitmapFactory.Options options) {
        //noinspection deprecation
        options.inPurgeable = true;
        //noinspection deprecation
        options.inInputShareable = true;
        options.inScaled = false;
    }
}
