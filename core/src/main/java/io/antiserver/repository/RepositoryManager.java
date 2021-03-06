package io.antiserver.repository;

import java.net.URL;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.antiserver.api.AntiserverMavenDependency;

public interface RepositoryManager {

    CompletableFuture<List<URL>> classpath(List<AntiserverMavenDependency> dependencies);

    CompletableFuture<Void> preload(List<AntiserverMavenDependency> dependencies);

}
