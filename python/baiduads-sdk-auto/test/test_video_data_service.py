"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from videodata.api.video_data_service import VideoDataService  # noqa: E501


class TestVideoDataService(unittest.TestCase):
    """VideoDataService unit test stubs"""

    def setUp(self):
        self.api = VideoDataService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_label_data(self):
        """Test case for get_label_data

        """
        pass

    def test_get_second_level_data(self):
        """Test case for get_second_level_data

        """
        pass


if __name__ == '__main__':
    unittest.main()
