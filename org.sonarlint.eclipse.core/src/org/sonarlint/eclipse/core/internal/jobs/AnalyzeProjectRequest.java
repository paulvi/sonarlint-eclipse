/*
 * SonarLint for Eclipse
 * Copyright (C) 2015 SonarSource
 * sonarqube@googlegroups.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonarlint.eclipse.core.internal.jobs;

import java.util.Collection;
import javax.annotation.Nullable;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

public class AnalyzeProjectRequest {

  private final IProject project;
  private final Collection<IFile> onlyOnFiles;

  public AnalyzeProjectRequest(IProject project, @Nullable Collection<IFile> onlyOnFiles) {
    this.project = project;
    this.onlyOnFiles = onlyOnFiles;
  }

  public IProject getProject() {
    return project;
  }

  public Collection<IFile> getOnlyOnFiles() {
    return onlyOnFiles;
  }

}