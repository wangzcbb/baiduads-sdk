"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from crowdfeed.api.crowd_feed_service import CrowdFeedService  # noqa: E501


class TestCrowdFeedService(unittest.TestCase):
    """CrowdFeedService unit test stubs"""

    def setUp(self):
        self.api = CrowdFeedService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_bind_adgroup(self):
        """Test case for get_bind_adgroup

        """
        pass


if __name__ == '__main__':
    unittest.main()
