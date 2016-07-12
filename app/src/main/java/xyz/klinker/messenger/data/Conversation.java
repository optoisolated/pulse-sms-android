/*
 * Copyright (C) 2016 Jacob Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.klinker.messenger.data;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import xyz.klinker.messenger.R;

/**
 * Data object for holding information about a conversation.
 */
public class Conversation {

    public long id;
    public ColorSet colors;
    public boolean pinned;
    public boolean read;
    public long timestamp;
    public String title;
    public String phoneNumbers;
    public String snippet;

    public Conversation(String name, String phoneNumbers, ColorSet colors,
                        boolean pinned, boolean read, long timestamp, String snippet) {
        this.title = name;
        this.phoneNumbers = phoneNumbers;
        this.colors = colors;
        this.pinned = pinned;
        this.read = read;
        this.timestamp = timestamp;
        this.snippet = snippet;
    }

    public static List<Conversation> getFakeConversations(Context context) {
        List<Conversation> conversations = new ArrayList<>();

        conversations.add(new Conversation(
                "Luke Klinker",
                "(515) 991-1493",
                ColorSet.INDIGO(context),
                true,
                true,
                System.currentTimeMillis() - (1000 * 60 * 60),
                "So maybe not going to be able to get platinum huh?"
        ));

        conversations.add(new Conversation(
                "Matt Swiontek",
                "(708) 928-0846",
                ColorSet.RED(context),
                true,
                true,
                System.currentTimeMillis() - (1000 * 60 * 60 * 12),
                "Whoops ya idk what happened but anysho drive safe"
        ));

        conversations.add(new Conversation(
                "Kris Klinker",
                "(515) 419-6726",
                ColorSet.PINK(context),
                false,
                false,
                System.currentTimeMillis() - (1000 * 60 * 20),
                "Will probably be there from 6:30-9, just stop by when you can!"
        ));

        conversations.add(new Conversation(
                "Andrew Klinker",
                "(515) 991-8235",
                ColorSet.BLUE(context),
                false,
                true,
                System.currentTimeMillis() - (1000 * 60 * 60 * 26),
                "Just finished, it was a lot of fun"
        ));

        conversations.add(new Conversation(
                "Aaron Klinker",
                "(515) 556-7749",
                ColorSet.GREEN(context),
                false,
                true,
                System.currentTimeMillis() - (1000 * 60 * 60 * 32),
                "Yeah I'll do it when I get home"
        ));

        conversations.add(new Conversation(
                "Mike Klinker",
                "(515) 480-8532",
                ColorSet.BROWN(context),
                false,
                true,
                System.currentTimeMillis() - (1000 * 60 * 60 * 55),
                "Yeah so hiking around in some place called beaver meadows now."
        ));

        conversations.add(new Conversation(
                "Ben Madden",
                "(847) 609-0939",
                ColorSet.PURPLE(context),
                false,
                true,
                System.currentTimeMillis() - (1000 * 60 * 60 * 78),
                "Maybe they'll run into each other on the way back... idk"
        ));

        return conversations;
    }

}