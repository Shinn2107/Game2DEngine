package com.devfriendly.system.converter;

/**
 * Created by Shinn on 27.10.2016.
 */
public interface Converter<SOURCE,TARGET>  {

    TARGET convert(SOURCE source);
}
