"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from searchfeed.api.search_feed_service import SearchFeedService  # noqa: E501


class TestSearchFeedService(unittest.TestCase):
    """SearchFeedService unit test stubs"""

    def setUp(self):
        self.api = SearchFeedService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_app_id_name_feed(self):
        """Test case for get_app_id_name_feed

        """
        pass

    def test_get_biz_area_feed(self):
        """Test case for get_biz_area_feed

        """
        pass

    def test_get_coordinate_feed(self):
        """Test case for get_coordinate_feed

        """
        pass

    def test_get_media_packages(self):
        """Test case for get_media_packages

        """
        pass

    def test_get_medias(self):
        """Test case for get_medias

        """
        pass

    def test_get_ocpc_trans_feed(self):
        """Test case for get_ocpc_trans_feed

        """
        pass

    def test_get_recm_word_packages_feed(self):
        """Test case for get_recm_word_packages_feed

        """
        pass


if __name__ == '__main__':
    unittest.main()
