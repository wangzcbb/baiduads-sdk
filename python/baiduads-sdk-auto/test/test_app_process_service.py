"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from appprocess.api.app_process_service import AppProcessService  # noqa: E501


class TestAppProcessService(unittest.TestCase):
    """AppProcessService unit test stubs"""

    def setUp(self):
        self.api = AppProcessService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_app_list(self):
        """Test case for get_app_list

        """
        pass


if __name__ == '__main__':
    unittest.main()
