package com.fanatical;

import org.elasticsearch.client.*;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ESTest {
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    public void createIndex() throws IOException {
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("aren_index");
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);
    }

    @Test
    public void testExistIndex() throws IOException {
        GetIndexRequest request = new GetIndexRequest("aren_index");
        boolean exists = restHighLevelClient.indices().exists(request, RequestOptions.DEFAULT);
        System.out.println(exists);
        //RestHighLevelClient的包装器，提供访问索引API的方法。
        IndicesClient indices = restHighLevelClient.indices();
        //RestHighLevelClient的包装器，提供访问集群API的方法
        ClusterClient cluster = restHighLevelClient.cluster();
        //RestHighLevelClient的包装器，提供访问与弹性ccr相关的方法的方法
        CcrClient ccr = restHighLevelClient.ccr();
        //RestHighLevelClient的包装器，它提供用于访问相关方法的方法
        EnrichClient enrich = restHighLevelClient.enrich();
        //获取低级客户端
        RestClient lowLevelClient = restHighLevelClient.getLowLevelClient();
        IndexLifecycleClient indexLifecycleClient = restHighLevelClient.indexLifecycle();
        GraphClient graph = restHighLevelClient.graph();
        IngestClient ingest = restHighLevelClient.ingest();
        LicenseClient license = restHighLevelClient.license();
        MachineLearningClient machineLearningClient = restHighLevelClient.machineLearning();
        MigrationClient migration = restHighLevelClient.migration();
        RollupClient rollup = restHighLevelClient.rollup();
        SecurityClient security = restHighLevelClient.security();
        SnapshotClient snapshot = restHighLevelClient.snapshot();
        TasksClient tasks = restHighLevelClient.tasks();
        TransformClient transform = restHighLevelClient.transform();
        WatcherClient watcher = restHighLevelClient.watcher();
        XPackClient xpack = restHighLevelClient.xpack();

    }
}
