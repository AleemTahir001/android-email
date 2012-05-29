/*
 * Copyright (C) 2011 Google Inc.
 * Licensed to The Android Open Source Project.
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

package com.android.mail.photo.provider;

import android.net.Uri;

public final class PhotoContract {
    /** Columns for the view {@link #PHOTO_VIEW} */
    public static interface PhotoViewColumns {
        /**
         * This column is a {@link Uri} that can be queried
         * for this individual image (resulting cursor has one single row for this image).
         */
        public static final String URI = "uri";
        /**
         * This column is a {@link Uri} that points to the downloaded local file
         * This value is undefined in any other state.
         */
        public static final String CONTENT_URI = "contentUri";
        /**
         * This string column is the MIME type.
         */
        public static final String CONTENT_TYPE = "contentType";

    }

    public static interface PhotoQuery {
        /** Projection of the returned cursor */
        public final static String[] PROJECTION = {
            PhotoViewColumns.URI,
            PhotoViewColumns.CONTENT_URI,
            PhotoViewColumns.CONTENT_TYPE,
        };

        public final static int INDEX_URI = 0;
        public final static int INDEX_CONTENT_URI = 1;
        public final static int INDEX_CONTENT_TYPE = 2;
    }

    public static final class ContentTypeParameters {
        /**
         * Parameter used to specify which type of content to return.
         * Allows multiple types to be specified.
         */
        public static final String CONTENT_TYPE = "contentType";

        private ContentTypeParameters() {}
    }
}
