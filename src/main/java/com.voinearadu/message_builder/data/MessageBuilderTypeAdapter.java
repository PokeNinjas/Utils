package com.voinearadu.message_builder.data;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.voinearadu.file_manager.dto.GsonSerializer;
import com.voinearadu.message_builder.MessageBuilder;

import java.lang.reflect.Type;

@SuppressWarnings("unused")
public class MessageBuilderTypeAdapter extends GsonSerializer<MessageBuilder> {

    public MessageBuilderTypeAdapter(ClassLoader classLoader) {
        super(classLoader, MessageBuilder.class);
    }

    @Override
    public MessageBuilder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) {
        return new MessageBuilder(jsonElement.getAsString());
    }

    @Override
    public JsonElement serialize(MessageBuilder src, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(src.getBase());
    }

}
