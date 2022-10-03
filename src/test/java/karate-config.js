function fn() {
    var env = karate.env; // get system property 'karate.env'
    karate.log('karate.env system property was:', env);
    karate.configure('headers', {Accept: 'application/json'});

    if (!env) {
        env = 'dev';

        var config =
            {
                env: env,
                baseUrl: 'https://petstore.swagger.io/v2'
            }

        karate.configure('connectTimeout', 5000);
        karate.configure('readTimeout', 5000);
        return config;
    }
}
