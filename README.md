## [Distributed SQL transaction & query engine for data sharding, scaling, encryption, and more - on any database.](https://shardingsphere.apache.org/)

**Official Website:** [https://shardingsphere.apache.org/](https://shardingsphere.apache.org/)

[![GitHub Release](https://img.shields.io/github/release/apache/shardingsphere.svg)](https://github.com/apache/shardingsphere/releases)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=apache_shardingsphere&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=apache_shardingsphere)

[![CI](https://github.com/apache/shardingsphere/actions/workflows/ci.yml/badge.svg)](https://github.com/apache/shardingsphere/actions/workflows/ci.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=apache_shardingsphere&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=apache_shardingsphere)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=apache_shardingsphere&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=apache_shardingsphere)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=apache_shardingsphere&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=apache_shardingsphere)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=apache_shardingsphere&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=apache_shardingsphere)
[![codecov](https://codecov.io/gh/apache/shardingsphere/branch/master/graph/badge.svg)](https://codecov.io/gh/apache/shardingsphere)

[![OpenSSF Best Practices](https://bestpractices.coreinfrastructure.org/projects/5394/badge)](https://bestpractices.coreinfrastructure.org/projects/5394)

[![Slack](https://img.shields.io/badge/%20Slack-ShardingSphere%20Channel-blueviolet)](https://join.slack.com/t/apacheshardingsphere/shared_invite/zt-sbdde7ie-SjDqo9~I4rYcR18bq0SYTg)
[![Gitter](https://badges.gitter.im/shardingsphere/shardingsphere.svg)](https://gitter.im/shardingsphere/Lobby)

[![Twitter](https://img.shields.io/twitter/url/https/twitter.com/ShardingSphere.svg?style=social&label=Follow%20%40ShardingSphere)](https://twitter.com/ShardingSphere)

<table style="width:100%">
    <tr>
        <th>
            <a href="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map?activity=stars&repo_id=49876476" target="_blank" style="display: block" align="center">
                <picture>
                    <source media="(prefers-color-scheme: dark)" srcset="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map/thumbnail.png?activity=stars&repo_id=49876476&image_size=auto&color_scheme=dark" width="721" height="auto">
                    <img alt="Star Geographical Distribution of apache/shardingsphere" src="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map/thumbnail.png?activity=stars&repo_id=49876476&image_size=auto&color_scheme=light" width="721" height="auto">
                </picture>
            </a>
        </th>
        <th>
            <a href="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map?activity=pull-request-creators&repo_id=49876476" target="_blank" style="display: block" align="center">
                <picture>
                    <source media="(prefers-color-scheme: dark)" srcset="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map/thumbnail.png?activity=pull-request-creators&repo_id=49876476&image_size=auto&color_scheme=dark" width="721" height="auto">
                    <img alt="Pull Request Creator Geographical Distribution of apache/shardingsphere" src="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map/thumbnail.png?activity=pull-request-creators&repo_id=49876476&image_size=auto&color_scheme=light" width="721" height="auto">
                </picture>
            </a>
        </th>
        <th>
            <a href="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map?activity=issue-creators&repo_id=49876476" target="_blank" style="display: block" align="center">
                <picture>
                    <source media="(prefers-color-scheme: dark)" srcset="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map/thumbnail.png?activity=issue-creators&repo_id=49876476&image_size=auto&color_scheme=dark" width="721" height="auto">
                    <img alt="Issue Creator Geographical Distribution of apache/shardingsphere" src="https://next.ossinsight.io/widgets/official/analyze-repo-stars-map/thumbnail.png?activity=issue-creators&repo_id=49876476&image_size=auto&color_scheme=light" width="721" height="auto">
                </picture>
            </a>
        </th>
    </tr>
</table>

### OVERVIEW

<hr>

Apache ShardingSphere is a distributed SQL transaction & query engine that allows for data sharding, scaling, encryption, and more - on any database. Our community's guiding development concept is Database Plus for creating a complete ecosystem that allows you to transform any database into a distributed database system. 

It focuses on repurposing existing databases, by placing a standardized upper layer above existing and fragmented databases, rather than creating a new database. 

The goal is to provide unified database services and minimize or eliminate the challenges caused by underlying databases' fragmentation. 
This results in applications only needing to communicate with a single standardized service.

The concepts at the core of the project are `Connect`, `Enhance` and `Pluggable`.

- `Connect:` Flexible adaptation of database protocol, SQL dialect and database storage. It can quickly connect applications and heterogeneous databases.
- `Enhance:` Capture database access entry to provide additional features transparently, such as: redirect (sharding, readwrite-splitting and shadow), transform (data encrypt and mask), authentication (security, audit and authority), governance (circuit breaker and access limitation and analyze, QoS and observability).
- `Pluggable:` Leveraging the micro kernel and 3 layers pluggable mode, features and database ecosystem can be embedded flexibly. Developers can customize their ShardingSphere just like building with LEGO blocks.

ShardingSphere became an [Apache](https://apache.org/index.html#projects-list) Top-Level Project on April 16, 2020.

So far, ShardingSphere has been used by over [15,000 projects on GitHub](https://github.com/search?l=Maven+POM&q=shardingsphere+language%3A%22Maven+POM%22&type=Code).

### AI ABSTRACTION

[ShardingSphere wiki](https://deepwiki.com/apache/shardingsphere) which is generated by DeepWiki automatically.

### DOCUMENTATION📜

<hr>

[![EN doc](https://img.shields.io/badge/document-English-blue.svg)](https://shardingsphere.apache.org/document/current/en/overview/)
[![CN doc](https://img.shields.io/badge/文档-中文版-blue.svg)](https://shardingsphere.apache.org/document/current/cn/overview/)

For full documentation & more details, visit: [Docs](https://shardingsphere.apache.org/document/current/en/overview/)

### CONTRIBUTION🚀🧑💻

<hr>

For guides on how to get started and setup your environment, contributor & committer guides, visit: [Contribution Guidelines](https://shardingsphere.apache.org/community/en/involved/)

### Team

<hr>

We deeply appreciate [community contributors](https://shardingsphere.apache.org/community/en/team) for their dedication to Apache ShardingSphere.

##

### COMMUNITY & SUPPORT💝🖤

<hr>

:link: [Mailing List](https://shardingsphere.apache.org/community/en/involved/subscribe/). Best for: Apache community updates, releases, changes.

:link: [GitHub Issues](https://github.com/apache/shardingsphere/issues). Best for: larger systemic questions/bug reports or anything development related.

:link: [GitHub Discussions](https://github.com/apache/shardingsphere/discussions). Best for: technical questions & support, requesting new features, proposing new features.

:link: [Slack channel](https://join.slack.com/t/apacheshardingsphere/shared_invite/zt-sbdde7ie-SjDqo9~I4rYcR18bq0SYTg). Best for: instant communications and online meetings, sharing your applications.

:link: [Twitter](https://twitter.com/ShardingSphere). Best for: keeping up to date on everything ShardingSphere.

:link: [LinkedIn](https://www.linkedin.com/showcase/apache-shardingsphere/e). Best for: professional networking and career development with other ShardingSphere contributors.

##

### STATUS👀

<hr>

:white_check_mark: Version 5.5.2: released :tada:

🔗 For the release notes, follow this link to the relevant [GitHub page](https://github.com/apache/shardingsphere/blob/master/RELEASE-NOTES.md).

:soon: Version 5.5.3

We are currently working towards our 5.5.3 milestone.
Keep an eye on the [milestones page](https://github.com/apache/shardingsphere/milestones) of this repo to stay up to date.

[comment]: <> (##)

[comment]: <> (### NIGHTLY BUILDS:)

[comment]: <> (<hr>)

[comment]: <> (A nightly build of ShardingSphere from the latest master branch is available. )

[comment]: <> (The package is updated daily and is available [here]&#40;http://117.48.121.24:8080&#41;.)

[comment]: <> (##)

[comment]: <> (**‼️ Notice:**)

[comment]: <> (<hr>)

[comment]: <> (Use this nightly build at your own risk! )

[comment]: <> (The branch is not always fully tested. )

[comment]: <> (The nightly build may contain bugs, and there may be new features added which may cause problems with your environment. )

##

### How it Works

<hr>

Apache ShardingSphere includes 2 independent products: JDBC & Proxy.
They all provide functions of data scale-out, distributed transaction and distributed governance, applicable in a variety of situations such as Java-based isomorphism, heterogeneous language and Cloud-Native.

### ShardingSphere-JDBC

<hr>

[![Maven Status](https://img.shields.io/maven-central/v/org.apache.shardingsphere/shardingsphere-jdbc.svg?color=green)](https://mvnrepository.com/artifact/org.apache.shardingsphere/shardingsphere-jdbc)

A lightweight Java framework providing extra services at the Java JDBC layer. 
With the client end connecting directly to the database, it provides services in the form of a jar and requires no extra deployment and dependence.

:link: For more details, follow this [link to the official website](https://shardingsphere.apache.org/document/current/en/overview/#shardingsphere-jdbc).

### ShardingSphere-Proxy

<hr>

[![Nightly-Download](https://img.shields.io/static/v1?label=nightly-builds&message=download&color=orange)](https://nightlies.apache.org/shardingsphere/)
[![Download](https://img.shields.io/badge/release-download-orange.svg)](https://www.apache.org/dyn/closer.lua/shardingsphere/5.3.2/apache-shardingsphere-5.3.2-shardingsphere-proxy-bin.tar.gz)
[![Docker Pulls](https://img.shields.io/docker/pulls/apache/shardingsphere-proxy.svg)](https://store.docker.com/community/images/apache/shardingsphere-proxy)

A transparent database proxy, providing a database server that encapsulates the database binary protocol to support heterogeneous languages. 
Friendlier to DBAs, the MariaDB, MySQL and PostgreSQL version now provided can use any kind of terminal.

:link: For more details, follow this [link to the official website](https://shardingsphere.apache.org/document/current/en/overview/#shardingsphere-proxy).

### Hybrid Architecture

<hr>

ShardingSphere-JDBC adopts a decentralized architecture, applicable to high-performance light-weight OLTP applications developed with Java. 
ShardingSphere-Proxy provides static entry and all languages support, suitable for an OLAP application and sharding databases management and operation.

Through the combination of ShardingSphere-JDBC & ShardingSphere-Proxy together with a unified sharding strategy by the same registry center, the ShardingSphere ecosystem can build an application system suitable to all kinds of scenarios.

:link: More details can be found following this [link to the official website](https://shardingsphere.apache.org/document/current/en/overview/#hybrid-architecture).

##

### Solution

<hr>

| *Solutions/Features* | *Distributed Database*  | *Data Security*      | *Database Gateway*                | *Stress Testing* |
|----------------------|-------------------------|----------------------|-----------------------------------|------------------|
|                      | Data Sharding           | Data Encryption      | Heterogeneous Databases Supported | Shadow Database  |
|                      | Read/write Splitting    | Row Authority (TODO) | SQL Dialect Translate (TODO)      | Observability    |
|                      | Distributed Transaction | SQL Audit (TODO)     |                                   |                  |
|                      | Elastic Scale-out       | SQL Firewall (TODO)  |                                   |                  |
|                      | High Availability       |                      |                                   |                  |

##

### Roadmap

<hr>

![Roadmap](https://shardingsphere.apache.org/document/current/img/roadmap_en.png)

##

### How to Build Apache ShardingSphere

<hr>

Check out [Wiki](https://github.com/apache/shardingsphere/wiki) section for details on how to build Apache ShardingSphere and a full guide on how to get started and setup your local dev environment.

##

### Landscapes

<hr>

<p align="center">
<br/><br/>
<img src="https://landscape.cncf.io/images/cncf-landscape-horizontal-color.svg" width="165"/>&nbsp;&nbsp;<img src="https://www.cncf.io/wp-content/uploads/2023/04/cncf-main-site-logo.svg" width="200"/>
<br/><br/>
Apache ShardingSphere enriches the <a href="https://landscape.cncf.io/?category=app-definition-and-development&grouping=category">CNCF CLOUD NATIVE Landscape</a>.
</p>

##
