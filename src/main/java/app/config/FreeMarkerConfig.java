/*
Copyright 2009-2010 Igor Polevoy 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/

package app.config;

import org.javalite.activejdbc.Base;
import org.javalite.activeweb.freemarker.AbstractFreeMarkerConfig;

/**
 * @author Igor Polevoy
 */
public class FreeMarkerConfig extends org.javalite.activeweb.freemarker.AbstractFreeMarkerConfig {
    @Override
    public void init() {
        //this is to override a strange FreeMarker default processing of numbers 
        getConfiguration().setNumberFormat("0.##");
        getTag("link_to").overrideContext("");
        getTag("form").overrideContext("");
    }
}