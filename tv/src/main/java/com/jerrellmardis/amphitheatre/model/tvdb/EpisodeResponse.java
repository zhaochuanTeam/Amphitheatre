/*
 * Copyright (C) 2014 Jerrell Mardis
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

package com.jerrellmardis.amphitheatre.model.tvdb;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class EpisodeResponse {

    @Element(name = "Episode", required = false)
    private Episode mEpisode;

    public Episode getEpisode() {
        return mEpisode;
    }

    @Override
    public String toString() {
        return "EpisodeResponse{" +
                "mEpisode=" + mEpisode +
                '}';
    }
}
