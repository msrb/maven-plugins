package org.apache.maven.plugin.resources;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.model.Resource;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.List;

/**
 * Copy resources of the configured plugin attribute resources
 * 
 * @author Olivier Lamy
 * @since 2.3
 */
@Mojo( name = "copy-resources", threadSafe = true )
public class CopyResourcesMojo
    extends ResourcesMojo
{
    
    /**
     * The output directory into which to copy the resources.
     */
    @Parameter( required = true )
    private File outputDirectory;

    /**
     * The list of resources we want to transfer. See the Maven Model for a
     * description of how to code the resources element.
     */
    @Parameter( required = true )
    private List<Resource> resources;


    public File getOutputDirectory()
    {
        return outputDirectory;
    }

    public void setOutputDirectory( File outputDirectory )
    {
        this.outputDirectory = outputDirectory;
    }

    public List<Resource> getResources()
    {
        return resources;
    }

    public void setResources( List<Resource> resources )
    {
        this.resources = resources;
    }

    public List<String> getFilters()
    {
        return filters;
    }

    public void setFilters( List<String> filters )
    {
        this.filters = filters;
    }    

}
